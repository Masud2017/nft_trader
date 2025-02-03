package com.nft_market_place.nft_trader.services;

public class AuthServiceImpl implements AuthService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    private Logger logger = LoggerFactory.getLogger(AuthService.class);
    
    @Override
    public ResponseModel getNonce(String address) {
        User user = this.userRepository.findByAddress(address);

        return new ResponseModel().setMessage(String.valueOf(user.getNonce())).setStatusCode(HttpStatus.OK);
    }
    
    @Override
    public ResponseModel authenticate(User user) {
        User result = this.userRepository.findByAddress(user.getAddress());
        

        if (result == null) {
            return new ResponseModel().setMessage("User not found").setStatusCode(HttpStatus.NOT_FOUND);
        }
        // if (!this.passwordEncoder.matches(user.getPassword(), result.getPassword())) {
        //     return new ResponseModel().setMessage("Invalid password").setStatusCode(HttpStatus.UNAUTHORIZED);
        // }

        

        return new ResponseModel().setMessage("User authenticated successfully").setStatusCode(HttpStatus.OK);
    }

    @Override
    public ResponseModel register(User user) {
        User result = this.userRepository.findByAddress(user.getAddress());
        if (result != null) {
            return new ResponseModel().setMessage("The user is already registered").setStatusCode(HttpStatus.BAD_REQUEST);
        }


        user.setPassword(this.passwordEncoder.encode(user.getPassword()));

        this.userRepository.save(user);
        return new ResponseModel().setMessage("User registered successfully").setStatusCode(HttpStatus.OK);
    }

    @Override
    public ResponseModel addProfileImage(ProfileImage profileImage, Long userId) {
        User user = this.userRepository.findById(userId).get();
        user.setProfileImage(profileImage);
        this.userRepository.save(user);
        return new ResponseModel().setMessage("Profile image added successfully").setStatusCode(HttpStatus.OK);
    }

    @Override
    public ResponseModel addProfileImage(ProfileImage profileImage, String address) {
        User user = this.userRepository.findByAddress(address);
        if (user == null) {
            return new ResponseModel().setMessage("User not found").setStatusCode(HttpStatus.NOT_FOUND);
        }
        user.setProfileImage(profileImage);
        this.userRepository.save(user);
        return new ResponseModel().setMessage("Profile image added successfully").setStatusCode(HttpStatus.OK);
    }
}
