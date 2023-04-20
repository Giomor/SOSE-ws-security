package it.univaq.sose.example.wssecurity.cxf;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class UsernameTokenCallbackHandler implements CallbackHandler {

	public void handle(Callback[] callbacks) {
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
		if (pc.getIdentifier().equals("admin")) {
			pc.setPassword("pwd123");
		}
	}
	
}

