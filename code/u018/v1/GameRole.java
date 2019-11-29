package u018.v1;

/**
 * Created by HuGuodong on 11/30/19.
 */
public class GameRole {
  private int life;
  private int atk;
  private int def;

  public void showState(){
    System.out.println(toString());
  }


  @Override
  public String toString() {
    return "GameRole{" +
        "life=" + life +
        ", atk=" + atk +
        ", def=" + def +
        '}';
  }

  public void die(){
    this.life = 0;
    this.atk = 0;
    this.def = 0;
  }

  public void loadState(GameRole role){
    this.life = role.life;
    this.atk = role.atk;
    this.def = role.def;
  }

  public GameRole(GameRole role){
    this.life = role.life;
    this.atk = role.atk;
    this.def = role.def;
  }

  public GameRole(int life, int atk, int def) {
    this.life = life;
    this.atk = atk;
    this.def = def;
  }

  public int getLife() {
    return life;
  }

  public void setLife(int life) {
    this.life = life;
  }

  public int getAtk() {
    return atk;
  }

  public void setAtk(int atk) {
    this.atk = atk;
  }

  public int getDef() {
    return def;
  }

  public void setDef(int def) {
    this.def = def;
  }
}
