package com.uxwind.command.remote;

public class LightOffCommand implements Command {
  private final Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}
