package com.faizal108.blogvista.user.entity;

import com.faizal108.blogvista.bookmark.entity.Bookmark;
import com.faizal108.blogvista.post.entity.Post;
import com.faizal108.blogvista.utils.Enum.Role;
import com.faizal108.blogvista.utils.entity.Audit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "user")
public class User extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    @Column(name = "username", nullable = false, unique = true)
    private String userName;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false,unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password; //robust hashing (e.g., BCrypt)

    //This field is not persist.
    @Transient
    private String confirmPassword;

    //This field is not persist.
    @Transient
    private String otp;

    @Column(name = "bio", columnDefinition = "TEXT")
    private String bio;

    //Here only store profile image url. actual image is store on some other platform.
    @Column(name = "profile_url")
    private String profilePhotoUrl;

    @Embedded // address fields are attach here with address_*
    private Address address;

    @Column(name = "role")
    private Role role;

    @OneToMany(orphanRemoval = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "postID")
    @Column(name = "postID")
    private List<Post> post;

    @OneToMany// need to be fixed
    @JoinColumn(name = "bookmarkID")
    @Column(name = "bookmarkID")
    private List<Bookmark> bookmark;
}


