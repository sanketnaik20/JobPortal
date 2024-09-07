package com.telusko.spring_boot_rest.repo;

import java.util.ArrayList;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.spring_boot_rest.model.*;

;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    // arrayList to store store JobPost objects
//     List<JobPost> jobs = new ArrayList<>();
//     // ****************************************************************************
//     // constructor->injecting objects into ArrayList defined above.
//     // ****************************************************************************
//     // method to return all JobPosts
//     public List<JobPost> returnAllJobPosts() {
//         return jobs;
//     }
//     // method to save a job post object into arrayList
//     public void addJobPost(JobPost job) {
//         jobs.add(job);
//     }
//     public JobPost getJob(int postId) {
//         // TODO Auto-generated method stub
//         for (JobPost job : jobs) {
//             if (job.getPostId() == postId) {
//                 return job;
//             }
//         }
//         return null;
//     }
//     public void updateJob(JobPost jobPost) {
//         for (JobPost jobPost1 : jobs) {
//             if (jobPost1.getPostId() == jobPost.getPostId()) {
//                 jobPost1.setPostProfile(jobPost.getPostProfile());
//                 jobPost1.setPostDesc(jobPost.getPostDesc());
//                 jobPost1.setReqExperience(jobPost.getReqExperience());
//                 jobPost1.setPostTechStack(jobPost.getPostTechStack());
//             }
//         }
//     }
// 	public void deleteJob(int postId) {
// 		for(JobPost jobPost:jobs){
// 			if(jobPost.getPostId()==postId){
// 				jobs.remove(jobPost);
// 			}
// 		}
// 	}


    List<JobPost>findByPostProfileContainingOrPostDescContaining(String postProfile,String postDesc);
}
