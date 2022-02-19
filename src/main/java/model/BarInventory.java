package model;

public class BarInventory {
    private int inventoryId;
    private int bottleCount;
    private float amountLitters;

    @Override
    public String toString() {
        return "BarInventory{" +
                "inventoryId=" + inventoryId +
                ", bottleCount=" + bottleCount +
                ", amountLitters=" + amountLitters +
                '}';
    }

    public int getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(int inventoryId) {
        this.inventoryId = inventoryId;
    }

    public int getBottleCount() {
        return bottleCount;
    }

    public void setBottleCount(int bottleCount) {
        this.bottleCount = bottleCount;
    }

    public float getAmountLitters() {
        return amountLitters;
    }

    public void setAmountLitters(float amountLitters) {
        this.amountLitters = amountLitters;
    }

    public BarInventory() {
    }

    public BarInventory(int inventoryId, int bottleCount, float amountLitters) {
        this.inventoryId = inventoryId;
        this.bottleCount = bottleCount;
        this.amountLitters = amountLitters;
    }
}
