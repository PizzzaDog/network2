package by.overone.security;

import by.overone.entity.User;
import by.overone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //Достаем нашего пользователя из БД
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        //Создаем на его основе имплементацию пользователя Spring'а
        MySecurityUser securityUser = new MySecurityUser(user);

        /* Т.к. MySecurityUser implements UserDetails
            мы можем вернуть нашего MySecurityUser
         */
        return securityUser;
    }
}
