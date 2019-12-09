package u027;

import java.util.List;

/**
 * Created by HuGuodong on 12/10/19.
 */
interface Expression {

  List<String> interpret(Context ctx);
}