package id.mustofa.android.colorblind.data;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import id.mustofa.android.colorblind.model.ColoredBox;

public class ColoredBoxData {
  
  // Colors data taken manually from https://www.xrite.com/hue-test for learning purposes
  private static final String[] COLORS = {
      "#b2766f", "#b17466", "#ae725f", "#a8745a", "#a87452", "#a8794e", "#a97e4c", "#a78244", "#a28946", "#9d8e48", // row 1
      "#97914b", "#8d9352", "#86955c", "#7e9760", "#7c9567", "#699a71", "#649a76", "#5b947a", "#589480", "#529687", // row 2
      "#4e9689", "#4c9691", "#4a9696", "#4a9698", "#52949f", "#6090a5", "#688fa7", "#6c8aa6", "#7489a7", "#7b84a3", // row 3
      "#8484a3", "#8d85a3", "#9483a0", "#99819d", "#9f7f98", "#a9798b", "#ae7787", "#b1757f", "#b3757a", "#b37673"  // row 4
  };
  
  public static List<ColoredBox> getAll() {
    List<ColoredBox> data = new ArrayList<>();
    for (int i = 0; i < COLORS.length; i++) {
      int color = Color.parseColor(COLORS[i]);
      int value = i == 0 ? 40 : i;
      data.add(new ColoredBox(color, i, value));
    }
    
    // Shuffling boxes per row except the keys
    int t = 0;
    for (int i = 0; i < 4; i++) {
      Collections.shuffle(data.subList(1 + t, 9 + t)); // 1 - (8+1)
      t += 10;
    }
    return Collections.unmodifiableList(data);
  }
}
