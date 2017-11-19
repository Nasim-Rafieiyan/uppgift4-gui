package client;

import java.util.ArrayList;

class Database {

    String[] f0 = {"Geografi", "Italiens huvudstad?", "Neapel", "Genua", "Bari", "Rom", "Rom"};
    String[] f1 = {"Geografi", "Vad heter Sveriges bästa landskap?", "Skåne", "Jämtland", "Gotland", "Dalsland", "Skåne"};
    String[] f2 = {"Kropp", "Vilken kroppsdel sitter okbenet?", "Bröstet", "Ansiktet", "Armen", "Foten", "Ansiktet"};
    String[] f3 = {"Kropp", "En person med downs syndrom har tre exemplar av kromosom nummer?", "12", "2", "21", "6", "21"};
    
    ArrayList<String[]> qoa = new ArrayList<String[]>();

    public Database() {
        qoa.add(f0);
        qoa.add(f1);
        qoa.add(f2);
        qoa.add(f3);
    }
}
