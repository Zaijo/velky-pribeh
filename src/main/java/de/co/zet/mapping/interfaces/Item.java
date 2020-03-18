package de.co.zet.mapping.interfaces;

import java.nio.file.attribute.PosixFilePermission;
import lombok.Builder;

/**
 * TODO javadoc.
 *
 * @author Dominik Zajíček
 **/
@Builder
public class Item implements Link, Opinion, Position, Story, Time {

  private int position;

  @Override
  public int getPosition() {
    return position;
  }
}
