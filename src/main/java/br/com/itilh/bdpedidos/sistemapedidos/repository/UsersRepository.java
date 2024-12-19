package br.com.itilh.bdpedidos.sistemapedidos.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.itilh.bdpedidos.sistemapedidos.model.Users;

public interface UsersRepository extends JpaRepository<Users, BigInteger> {
    UserDetails findByLogin(String login);
}
