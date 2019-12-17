package u004;

/**
 * Created by HuGuodong on 12/17/19.
 */
public interface MessageQueue {

  void put();
}

interface MessageFormatter {

  void format();
}

class KafkaMessageQueue implements MessageQueue {

  @Override
  public void put() {

  }
}

class RocketMessageQueue implements MessageQueue {

  @Override
  public void put() {

  }
}

class JsonMessageFormatter implements MessageFormatter {

  @Override
  public void format() {

  }
}

class Demo {

  MessageQueue queue;

  Demo(MessageQueue queue) {
    this.queue = queue;
  }

  void setNotification(MessageFormatter formatter) {
    formatter.format();
  }

  public static void main(String[] args) {

  }
}