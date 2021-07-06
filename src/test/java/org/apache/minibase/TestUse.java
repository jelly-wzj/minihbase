package org.apache.minibase;

import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * TODO
 * <p/>
 *
 * @author: jelly [2021-06-30 15:59]
 */
public class TestUse {
    @Test
    public void use() throws IOException, InterruptedException {
        Config conf = new Config().setDataDir("/home/jelly/Desktop/data").setMaxMemstoreSize(1).setFlushMaxRetries(1)
                .setMaxDiskFiles(10);
        MiniBase db = MStore.create(conf).open();

//        db.put(Bytes.toBytes("1"), Bytes.toBytes(1));
//        TimeUnit.SECONDS.sleep(5);
//        db.put(Bytes.toBytes("2"), Bytes.toBytes(2));
//        TimeUnit.SECONDS.sleep(5);
//        db.put(Bytes.toBytes("3"), Bytes.toBytes(3));

/*        ThreadLocalRandom random = ThreadLocalRandom.current();
        for(;;){
            int randomInt = random.nextInt(1000);
            db.put(Bytes.toBytes(randomInt), Bytes.toBytes(randomInt));
                 TimeUnit.SECONDS.sleep(1);
        }*/
//        MiniBase.Iter<KeyValue> kv = db.scan();
//        while (kv.hasNext()) {
//            KeyValue next = kv.next();
//            System.out.println(Bytes.toInt(next.getKey()));
//        }

        System.out.println(db.get(Bytes.toBytes(101)));
    }
}
