package gnu.x11;


/** X value list. */
public class ValueList {
  public static final int ALL = 0xffff;


  protected int bitmask;
  protected int [] data;


  public ValueList (int count) {
    data = new int [count];
  }


  public void clear () { bitmask = 0; }


  public void aggregate (ValueList vl) {
    for (int i = 0; i < vl.data.length && i < 32; i++)
      if ((vl.bitmask & 1 << i) != 0)
        set (i, vl.data [i]);   // overwrite
  }


  public int count () {
    int k = 0;

    for (int i = 0; i < data.length && i < 32; i++)
      if ((bitmask & 1 << i) != 0) k++;

    return k;
  }


  public void copy (ValueList vl) {
    bitmask = vl.bitmask;
    System.arraycopy (data, 0, vl.data, 0, data.length);
  }


  public void set (int index, boolean value) {  
    set (index, value ? 1 : 0);
  }


  public void set (int index, int value) {
    bitmask |= (1 << index);
    data [index] = value;
  }


  public void write (RequestOutputStream o) {
    
    for (int i = 0; i < data.length && i < 32; i++)
      if ((bitmask & (1 << i)) != 0) {
        o.writeInt32 (data [i]);
      }
  }
  
  
  public int getBitmask() {

    return bitmask;
  }

  
  public void setBitmask(int bitmask) {

    this.bitmask = bitmask;
  }

  
  public int[] getData() {

    return data;
  }
  
  
  public void setData(int[] data) {

    this.data = data;
  }
}
