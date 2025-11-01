package w;

public enum statenum_t {

  NoState(-1),
  StatCount(0),
  ShowNextLoc(1);

  private final int value;

  statenum_t(int val) {
    this.value = val;
  }

  public int getValue() {
    return value;
  }


}
