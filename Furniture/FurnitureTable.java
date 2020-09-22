package Furniture;
    public class FurnitureTable extends Furniture{

        private int effectivesurface;
        private int numberofboxes;

        public FurnitureTable(String manufacturer, int price, String material) {
            super(manufacturer, price, material);
        }

        public FurnitureTable(String manufacturer, int price, String material, int numberofboxes, int effectivesurface) {
            super(manufacturer, price, material);
            this.numberofboxes = numberofboxes;
            this.effectivesurface = effectivesurface;
        }

        public FurnitureTable(String manufacturer, int price, String material, int effectivesurface) {
            super(manufacturer, price, material);
            this.effectivesurface = effectivesurface;
        }

        public int getEffectivesurface() {
            return effectivesurface;
        }

        public int getNumberofboxes() {
            return numberofboxes;
        }
    }
