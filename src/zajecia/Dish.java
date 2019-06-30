package zajecia;

    public class Dish {
        private String name;
        private DishType type;
        private double price;

        public Dish(String name, DishType type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public DishType getType() {
            return type;
        }

        public void setType(DishType type) {
            this.type = type;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }


