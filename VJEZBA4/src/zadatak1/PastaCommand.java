package zadatak1;

public class PastaCommand implements Command{

        private Chef chef;

        public PastaCommand(Chef chef) {
            this.chef = chef;
        }

        @Override
        public void cook() {
            chef.makePasta();
        }
}
