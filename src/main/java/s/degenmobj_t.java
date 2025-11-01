package s;

public final class degenmobj_t
    implements ISoundOrigin {

  private final int x, y, z;

  public degenmobj_t(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  public degenmobj_t(int x, int y) {
    this.x = x;
    this.y = y;
    this.z = 0;
  }

  @Override
  public int getX() {
    return x;
  }

  @Override
  public int getY() {
    return y;
  }

  @Override
  public int getZ() {
    return z;
  }

}
