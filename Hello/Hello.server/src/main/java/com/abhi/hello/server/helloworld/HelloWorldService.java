package com.abhi.hello.server.helloworld;

import com.abhi.hello.server.ServerSession;
import com.abhi.hello.shared.helloworld.HelloWorldFormData;
import com.abhi.hello.shared.helloworld.IHelloWorldService;

/**
 * @author Scout Robot
 */
public class HelloWorldService implements IHelloWorldService {

  @Override
  public HelloWorldFormData load(HelloWorldFormData input) {
    StringBuilder msg = new StringBuilder();
    msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
    input.getMessage().setValue(msg.toString());
    return input;
  }
}
