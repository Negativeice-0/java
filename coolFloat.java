import java.awt.Color;

class coolFloat {
    public static void main() {

        float hue = 5;
        float saturation = 10;
        float brightness = 10;

        int rgb = Color.HSBtoRGB(hue, saturation, brightness);
        int red = (rgb >> 16) &0xFF;
        int green = (rgb >> 8) &0xFF;
        int blue = rgb &0xFF;

    }
}
