package domaine;

     public enum MyQualities{
        A("Analytical mind"),
        M("Methodical approach"),
        T("Team working"),
        H("Hard working"),
        R("Result oriented");

        private final String description;

        MyQualities(String description){
            this.description = description;
        }

         public String getDescription() {
             return description;
         }
     }
