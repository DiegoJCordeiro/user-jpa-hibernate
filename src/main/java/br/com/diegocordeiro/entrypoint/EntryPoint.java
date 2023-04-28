package br.com.diegocordeiro.entrypoint;

public interface EntryPoint<T> {

    T put(T object);
    T findById(Long id);
}
