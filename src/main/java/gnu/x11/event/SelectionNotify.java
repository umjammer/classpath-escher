package gnu.x11.event;

import gnu.x11.Display;
import gnu.x11.RequestOutputStream;
import gnu.x11.ResponseInputStream;
import gnu.x11.Window;


/** X selection notify event. */
public final class SelectionNotify extends Event {

  private int time;
  private int requestorWindowID;
  private int selectionAtomID;
  private int targetAtomID;
  private int propertyAtomID;

  /**
   * For answering a selection request, with {@link Window#sendEvent}.
   *
   * @param propertyAtomID the property the data is in, 0 for a refusal
   */
  public SelectionNotify (Display display, int time, int requestorWindowID,
                          int selectionAtomID, int targetAtomID, int propertyAtomID) {
    super(display, EventCode.SELECTION_NOTIFY);
    this.time = time;
    this.requestorWindowID = requestorWindowID;
    this.selectionAtomID = selectionAtomID;
    this.targetAtomID = targetAtomID;
    this.propertyAtomID = propertyAtomID;
  }

  public SelectionNotify (Display display, ResponseInputStream in) {
    super (display, in);
    time = in.readInt32();
    requestorWindowID = in.readInt32();
    selectionAtomID = in.readInt32();
    targetAtomID = in.readInt32();
    propertyAtomID = in.readInt32();
    in.skip(8);
  }

  public int getSelectionAtomID() {
    return selectionAtomID;
  }

  public int getTargetAtomID() {
    return targetAtomID;
  }

  public int getPropertyAtomID() {
    return propertyAtomID;
  }

  @Override
  public void write (RequestOutputStream o) {
    super.write(o);
    o.writeInt32(time);
    o.writeInt32(requestorWindowID);
    o.writeInt32(selectionAtomID);
    o.writeInt32(targetAtomID);
    o.writeInt32(propertyAtomID);
    o.writeInt32(0);
    o.writeInt32(0);
  }
}
