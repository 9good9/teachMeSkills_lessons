public class ChangeLetter {
    public static void main(String[] args){
        char ch = '&';
        int position = 3;
        String str = "America’s music culture has been growing and spreading its popularity for many years. ";// +
        //  "The best known American singers are those who sing to the rock beat. " +
        // "Rock revolutionized music in America in the early 1950s and nowadays, shows no sign of slowing down. " +
        //  "There isn’t a corner of the globe that hasn’t felt the drive of American rock.";
        str = str.trim();

        String[] arrString = str.split("\\s*(\\s|,|!|\\.)\\s*");
        //StringBuilder newStrBuild = new StringBuilder();
        for (int i = 0; i < arrString.length; i++){
            String sumStr = arrString[i];
            StringBuilder strBuild = new StringBuilder(sumStr);
            if (position <= strBuild.length() - 1){
                strBuild.setCharAt(position,ch);
            }
            //newStrBuild.append(strBuild);
            System.out.print(strBuild + " ");
        }
        //System.out.println(newStrBuild);
    }
}
