package com.swipejobs.matchingengine.service.worker;

import com.swipejobs.matchingengine.config.AppConfig;
import com.swipejobs.matchingengine.model.worker.Worker;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * @author gnewitt
 * @version 1.0
 * @since 15/11/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class WorkerServiceImplTest {
    @Mock
    private RestTemplate restTemplate;

    @Mock
    private AppConfig appConfig;

    @InjectMocks
    WorkerServiceImpl testee;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetWorkers() throws Exception {
        Worker[] workers = {};

        when(restTemplate.getForObject(any(String.class),any())).thenReturn(workers);

        List<Worker> result = testee.getWorkers();

        assertThat(result,is(notNullValue()));
        assertThat(result.isEmpty(),is(true));
    }

}