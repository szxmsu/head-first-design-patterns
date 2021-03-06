package com.uxwind.state.gumball;

public class NoQuarterState implements State {
  private final GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  public void insertQuarter() {
    System.out.println("You inserted a quarter.");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  public void ejectQuarter() {
    System.out.println("You haven't inserted a quarter.");
  }

  public void turnCrank() {
    System.out.println("You turned, but there's no quarter.");
  }

  public void dispense() {
    System.out.println("You need to pay first.");
  }

  public void refill() {
    // Nothing to do.
  }

  public String toString() {
    return "Waiting for quarter.";
  }
}
