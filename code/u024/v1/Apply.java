package u024.v1;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class Apply {

  private APPLY_TYPE applyType;
  private String applyContent;
  private int applyNum;

  public Apply(APPLY_TYPE applyType, String applyContent, int applyNum) {
    this.applyType = applyType;
    this.applyContent = applyContent;
    this.applyNum = applyNum;
  }

  public APPLY_TYPE getApplyType() {
    return applyType;
  }

  public String getApplyContent() {
    return applyContent;
  }

  public int getApplyNum() {
    return applyNum;
  }

  @Override
  public String toString() {
    return "Apply{" +
        "applyType='" + applyType + '\'' +
        ", applyContent='" + applyContent + '\'' +
        ", applyNum='" + applyNum + '\'' +
        '}';
  }
}
