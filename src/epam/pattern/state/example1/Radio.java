package epam.pattern.state.example1;

/**
 * Created by Alex on 25.05.2016.
 * This is Pattern's CONTEXT
 * Depending on what STATE is currently used in CONTEXT, Radio is using different method
 */
public class Radio{
    Station station;

    void setStation(Station station){
        this.station = station;
    }

    void nextStation(){
        if (this.station instanceof Radio7){
            setStation(new RadioDFM());
        } else if (this.station instanceof RadioDFM) {
            setStation(new RadioNews());
        } else {
            setStation(new Radio7());
        }
    }

    void play(){
        station.play();
    }

}
