package br.com.diegocordeiro.entrypoint;

import java.util.List;

public interface EntryPoint<T> {

    T put(T object);
    T findById(Long id);
}
