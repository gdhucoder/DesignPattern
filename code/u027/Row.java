package u027;

/**
 * Created by HuGuodong on 12/10/19.
 */
class Row {

  private String name;
  private String surname;

  Row(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  @Override
  public String toString() {
    return name + " " + surname;
  }
}
