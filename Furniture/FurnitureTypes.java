package Furniture;
    public class FurnitureTypes extends Furniture{
        private int width;
        private int depth;
        private int height;

        public FurnitureTypes(String manufacturer, int price, String material) {
            super(manufacturer, price, material);
        }

        public FurnitureTypes(String manufacturer, int price, String material, int width, int depth, int height) {
            super(manufacturer, price, material);
            this.width = width;
            this.depth = depth;
            this.height = height;
        }

        public FurnitureTypes(String manufacturer, int price, String material, int width,int height) {
            super(manufacturer, price, material);
            this.width = width;
            this.height = height;
        }


        public int getWidth() {
            return width;
        }

        public int getDepth() {
            return depth;
        }

        public int getHeight() {
            return height;
        }
    }

