package ro.fasttrackit.mvnbase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecursivTest {
    Recursiv recursiv;
    @BeforeEach
    void setup(){
        recursiv= new Recursiv();
    }
    @Test
    @DisplayName("Sum primelor n numere")
    void sumN(){
        assertThat(recursiv.nNr(5)).isEqualTo(6);
    }



}