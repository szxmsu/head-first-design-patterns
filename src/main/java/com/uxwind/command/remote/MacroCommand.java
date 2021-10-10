package com.uxwind.command.remote;

public class MacroCommand implements Command {
  private final Command[] commands;

  public MacroCommand(Command[] commands) {
    this.commands = commands;
  }

  public void execute() {
    for (Command command : commands) {
      command.execute();
    }
  }
}
