package rpc.first.serialize.support.kryo;

import rpc.first.serialize.support.MessageCodecUtil;
import rpc.first.serialize.support.MessageEncoder;

public class KryoEncoder extends MessageEncoder {

    public KryoEncoder(MessageCodecUtil util) {
        super(util);
    }
}