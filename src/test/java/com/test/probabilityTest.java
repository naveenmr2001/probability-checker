package com.test;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.not;

public class probabilityTest {

    @Nested
    public class Coin{
        @Test
        void toCheckIfProbabilityOfHeadIsEqualsProbabilityOfTails() {

            Probability probabilityOfHeadToss = new Probability(0.5);

            Probability probabilityOfTailToss = new Probability(0.5);

            assertThat(probabilityOfHeadToss, is(equalTo(probabilityOfTailToss)));
        }
    }
    @Nested
    public class Requirement2{

        @Test
        void toCheckIfAEventAreOccurringTogetherIfTwoEventOccuringConform(){

            Probability probabilityOfSureOccurringEvent1 = new Probability(1);

            Probability probabilityOfSureOccurringEvent2 = new Probability(1);

            Probability expectedValue = new Probability(1);

            assertThat(probabilityOfSureOccurringEvent1.findTogetherOccurring(probabilityOfSureOccurringEvent2),is(equalTo(expectedValue)));

        }
        @Test
        void toCheckIfTwoEventAreOccurringTogether(){

            Probability probabilityOfEvent1 = new Probability(0.5);

            Probability probabilityOfEvent2 = new Probability(0.16);

            Probability exceptedResult = new Probability(0.08);

            assertThat(probabilityOfEvent1.findTogetherOccurring(probabilityOfEvent2),is(equalTo(exceptedResult)));
        }

        @Test
        void toCheckIfTwoEventAreOccurringTogetherFalse(){

            Probability probabilityOfEvent1 = new Probability(0.5);

            Probability probabilityOfEvent2 = new Probability(0.16);

            Probability exceptedResult = new Probability(0.1);

            assertThat(probabilityOfEvent1.findTogetherOccurring(probabilityOfEvent2),is(not(equalTo(exceptedResult))));
        }
    }

    @Nested
    public class Requirement3{

        @Test
        void toReturnProbabilityOfEventNotOccurringCertain(){
            Probability expectedValue = new Probability(0.5);

            Probability actualValue = new Probability(0.5);

            assertThat(expectedValue.complement(), is(equalTo(actualValue)));
        }

        @Test
        void toReturnProbabilityOfEventNotOccurringUnCertain(){
            Probability expectedValue = new Probability(1);

            Probability actualValue = new Probability(0);

            assertThat(expectedValue.complement(), is(equalTo(actualValue)));
        }

    }
}
