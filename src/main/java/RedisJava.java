import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisShardInfo;

public class RedisJava {
    public static void main(String[] args) {
        JedisShardInfo jedisShardInfo = new JedisShardInfo("192.168.0.106", 6379);
        jedisShardInfo.setPassword("zx135245");//密码认证
        Jedis jedis = new Jedis(jedisShardInfo);
        jedis.set("fucking", "fucking");
        System.out.println(jedis.get("fucking"));
    }
}
