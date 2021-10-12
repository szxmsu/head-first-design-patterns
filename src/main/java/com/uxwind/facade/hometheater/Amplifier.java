package com.uxwind.facade.hometheater;

public class Amplifier {
  private String description;
  private Tuner tuner;
  private StreamingPlayer player;

  public Amplifier(String description) {
    this.description = description;
  }

  public void on() {
    System.out.println(description + " on.");
  }

  public void off() {
    System.out.println(description + " off.");
  }

  public void setStereoSound() {
    System.out.println(description + " stereo mode on.");
  }

  public void setSurroundSound() {
    System.out.println(description + " surround sound on. (5 speakers, 1 subwoofer)");
  }

  public void setVolume(int level) {
    System.out.println(description + " setting volume to " + level + ".");
  }

  public void setTuner(Tuner tuner) {
    this.tuner = tuner;
    System.out.println(description + " setting tuner to " + player + ".");
  }

  public void setStreamingPlayer(StreamingPlayer player) {
    this.player = player;
    System.out.println(description + " setting Streaming player to " + player + ".");
  }

  public String toString() {
    return description;
  }
}
