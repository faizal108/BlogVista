package com.faizal108.blogvista.post.entity;

import com.faizal108.blogvista.user.entity.User;
import com.faizal108.blogvista.utils.Enum.PostStatus;
import com.faizal108.blogvista.utils.entity.Audit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "post")
public class Post extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postID;

    private String title;

    private PostStatus status;

    @ManyToOne
    @JoinColumn(name = "userID")
    @Column(name = "user")
    private User user;
}
