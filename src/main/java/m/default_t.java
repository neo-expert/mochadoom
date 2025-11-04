package m;

public class default_t {

  public String name;
  /**
   * this is supposed to be a pointer
   */
  public final int[] location;
  public final int defaultvalue;
  int scantranslate; // PC scan code hack
  int untranslated; // lousy hack

  public default_t(String name, int[] location, int defaultvalue) {
    this.name = name;
    this.location = location;
    this.defaultvalue = defaultvalue;
  }
}
