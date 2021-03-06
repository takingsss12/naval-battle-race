package com.sqli.nespresso.navalbattle.ships;

public final class Clipper extends Ship
{
  private static final double CLIPPER_SPEED_EXTENT = .2;

  public Clipper(int displacement, int mast)
  {
    super(displacement, mast);
  }

  @Override
  public double speed()
  {
    return (1 - CLIPPER_SPEED_EXTENT) * super.speed();
  }

}
