package br.com.itilh.bdpedidos.sistemapedidos.services;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.itilh.bdpedidos.sistemapedidos.model.Users;
import br.com.itilh.bdpedidos.sistemapedidos.repository.UsersRepository;

@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = (Users) usersRepository.findByLogin(username);
        if(user == null) throw new UsernameNotFoundException("Usuário não encontrado");
        return user;
    }

}
