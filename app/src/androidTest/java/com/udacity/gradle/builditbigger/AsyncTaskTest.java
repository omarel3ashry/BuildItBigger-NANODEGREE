package com.udacity.gradle.builditbigger;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import androidx.test.runner.AndroidJUnit4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;


@RunWith(AndroidJUnit4.class)

public class AsyncTaskTest {

    @Test
    public void verifyAsyncTaskResult() {

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(new EndpointsAsyncTask.OnCompleteListener() {
            @Override
            public void onComplete(String joke) {

            }
        });
        String joke = null;
        try {

            joke = endpointsAsyncTask.execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Assert.fail();

        } catch (ExecutionException e) {
            e.printStackTrace();
            Assert.fail();
        }

        assertNotNull(joke);
        assertFalse(joke.isEmpty());

    }
}
