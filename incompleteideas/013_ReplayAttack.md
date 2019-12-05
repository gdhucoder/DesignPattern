
# 重放攻击

## Replay Attacks

重放攻击(Replay Attacks)又称重播攻击、回放攻击，
是指攻击者发送一个目的主机已接收过的包，来达到欺骗系统的目的，
主要用于身份认证过程，破坏认证的正确性。重放攻击可以由发起者，
也可以由拦截并重发该数据的敌方进行。攻击者利用网络监听或者其他方式盗取认证凭据，
之后再把它重新发给认证服务器。重放攻击在任何网络通过程中都可能发生，是计算机世界黑客常用的攻击方式之一


## 重放攻击防止方式有三种

### 1、加时间戳

客户端与服务端有时间差，例如60s内的都算有效。那么黑客可以60s以内进行重放攻击，就有效。

### 2、时间戳+nonce（随机数）

每次请求成功后，保存nonce，例如放在redis和数据库中，再次请求如果nonce相同，则为重放攻击。

### 3、基于record的方案，就是你说的保存token

把每次请求保存在数据库中，接收到新请求后，校验是否存在，如果存在，则请求非法。也可以与1结合时间戳只保存60s以内的数据。

### 参考

[baike](https://baike.baidu.com/item/%E9%87%8D%E6%94%BE%E6%94%BB%E5%87%BB)
[tencent](https://cloud.tencent.com/document/product/214/1526)
[juejin](https://juejin.im/post/5ad43b86f265da239236cedc)