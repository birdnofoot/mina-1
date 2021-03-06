package com.mina;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

public class ByteArrayCodecFactory implements ProtocolCodecFactory{

	private ByteArrayDecoder decoder;
    private ByteArrayEncoder encoder;
    
    public ByteArrayCodecFactory() {
    	encoder = new ByteArrayEncoder();
        decoder = new ByteArrayDecoder();
    }
    
	public ProtocolEncoder getEncoder(IoSession session) throws Exception {
		// TODO Auto-generated method stub
		return encoder;
	}

	public ProtocolDecoder getDecoder(IoSession session) throws Exception {
		// TODO Auto-generated method stub
		return decoder;
	}

}
