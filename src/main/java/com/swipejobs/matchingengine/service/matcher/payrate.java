package com.swipejobs.matchingengine.service.matcher;


import com.swipejobs.matchingengine.model.job.Job;

import java.util.List;

public class payrate implements Matcher {

    private List<Job> top3;

    List<Job> generateList( List <Job> Jobss)
    {
        int first;
        int second;
        int third;

        List<Job> result = new List <Job>;

        for (Job j : Jobss)
        {

            first = Integer.parseInt(j.getBillRate().replace("$", ""));
            result.add(j);
        }



        return result;
    }
}
