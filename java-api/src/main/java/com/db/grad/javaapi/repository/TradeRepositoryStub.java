package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Trade;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class TradeRepositoryStub implements TradeRepository{

    private List<Trade> tradeList = new ArrayList<>();

    public long addTrade(Trade tr){
        tradeList.add(tr);
        return tradeList.size();
    }

    @Override
    public List<Trade> getAllTransactions() {
        return tradeList;
    }

    public void emptyAllData(){
        tradeList.clear();
    }


    @Override
    public List<Trade> findAll() {
        return null;
    }

    @Override
    public List<Trade> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Trade> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Trade> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Trade entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Trade> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Trade> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Trade> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Trade> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Trade> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Trade> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Trade> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Trade getOne(Integer integer) {
        return null;
    }

    @Override
    public Trade getById(Integer integer) {
        return null;
    }

    @Override
    public Trade getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Trade> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Trade> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Trade> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Trade> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Trade> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Trade> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Trade, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
