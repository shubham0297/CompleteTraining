package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Players;
import com.example.demo.repo.PlayerDetails;


@Service
public class PlayerService {
	
	@Autowired
	private PagingAndSortingRepository<Players, Long> repo;
	
	public Iterable<Players> findAll(){
		return this.repo.findAll();
	}
	
	public Iterable<Players> getByPlayerClub(Integer pageNo,Integer pageSize,String sortBy,String club) {
		PlayerDetails playerRepo = (PlayerDetails)repo;
		Pageable paging =PageRequest.of(pageNo,pageSize,Sort.by(sortBy).ascending());
		return  playerRepo.findByPlayerClub(club,paging);
	}
}
