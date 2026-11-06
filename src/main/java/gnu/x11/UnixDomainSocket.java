package gnu.x11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnixDomainSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;


/**
 * A connection to an X server through a unix domain socket, for
 * {@link Display#Display(Socket, String, int, int)}.
 *
 * This is the JDK's own channel because polling for events depends on
 * {@link InputStream#available()}, which only its streams answer for a unix
 * domain socket. It also reads and writes under separate locks, so that a
 * thread waiting for input does not hold up the requests of the others.
 */
public class UnixDomainSocket extends Socket {

    private final SocketChannel channel;

    /**
     * @param path the path of the socket of the X server
     * @throws IOException when there is nothing to connect to
     */
    public UnixDomainSocket(String path) throws IOException {
        channel = SocketChannel.open(UnixDomainSocketAddress.of(path));
    }

    @Override
    public InputStream getInputStream() {
        return Channels.newInputStream(channel);
    }

    @Override
    public OutputStream getOutputStream() {
        return Channels.newOutputStream(channel);
    }

    @Override
    public boolean isConnected() {
        return channel.isConnected();
    }

    @Override
    public synchronized void close() throws IOException {
        channel.close();
    }
}
