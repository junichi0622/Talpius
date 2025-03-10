package net.typicartist.talpius.gui.tgui.element;

import net.typicartist.talpius.gui.tgui.api.TalpiusGuiListener;
import net.typicartist.talpius.gui.tgui.fill.GradientFill;

public class Element implements TalpiusGuiListener {
    
    private final String name;

    private float parentX;
    private float parentY;

    private float offsetX;
    private float offsetY;

    private float width;
    private float height;

    protected static GradientFill mainFill;
    protected static GradientFill accentFill;
    protected static GradientFill categoryFill;
    protected static GradientFill outlineFill;
    protected static GradientFill backgroundFill;
    protected static GradientFill foregroundFill;
    protected static GradientFill primaryFill;
    protected static GradientFill secondaryFill;
    protected static GradientFill sliderFill;
    protected static GradientFill textBoxFill;
    protected static GradientFill fontFill;
    protected static GradientFill darkFontFill;
    protected static GradientFill subFontFill;

    protected static int dWheel = 0;

    public Element(String name, float parentX, float parentY, float offsetX, float offsetY, float width, float height) {
        this.name = name;
        this.parentX = parentX;
        this.parentY = parentY;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.width = width;
        this.height = height;
    }

    public static void setdWheel(int dWheel) {
        Element.dWheel = dWheel;
    }

    @Override
    public void onRender(int mouseX, int mouseY, float partialTicks) {

    }

    @Override
    public void onRenderPost(int mouseX, int mouseY, float partialTicks) {

    }

    @Override
    public boolean mouseClicked(int mouseX, int mouseY, int mouseButton) {
        return false;
    }

    @Override
    public boolean mouseClickMove(int mouseX, int mouseY, int clickedMouseBUtton, long timeSinceLastClick) {
        return false;
    }

    @Override
    public void mouseReleased(int mouseX, int mouseY, int state) {

    }

    @Override
    public void keyTyped(char typedChar, int keyCode) {

    }

    @Override
    public void onResize(float parentX, float parentY) {
        setParentX(parentX);
        setParentY(parentY);
        generateShapes();
    }

    protected void generateShapes() {

    }

    protected static void generateFills() {
        
    }

    public String getName() {
        return name;
    }

    public float getParentX() {
        return parentX;
    }

    public void setParentX(float parentX) {
        this.parentX = parentX;
    }

    public float getParentY() {
        return parentY;
    }

    public void setParentY(float parentY) {
        this.parentY = parentY;
    }

    public float getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(float offsetX) {
        this.offsetX = offsetX;
    }

    public float getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(float offsetY) {
        this.offsetY = offsetY;
    } 

    public float getPosX() {
        return parentX + offsetX;
    }

    public float getPosY() {
        return parentY + offsetY;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean mouseWithinBounds(int mouseX, int mouseY) {
        return (mouseX >= getPosX() && mouseX <= getPosX() + width && mouseY >= getPosY() && mouseY <= getPosY() + height);
    }

    public static boolean mouseWithinBounds(int mouseX, int mouseY, double x, double y, double width, double height) {
        return (mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height);
    }
}
