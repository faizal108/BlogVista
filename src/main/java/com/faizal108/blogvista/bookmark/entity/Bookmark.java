package com.faizal108.blogvista.bookmark.entity;

import com.faizal108.blogvista.category.entity.Category;
import com.faizal108.blogvista.post.entity.Post;
import com.faizal108.blogvista.user.entity.User;
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
@Table(name = "bookmark")
public class Bookmark extends Audit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookmarkID;

    @OneToOne
    @JoinColumn(name = "postID")
    private Post post;

    @ManyToOne // need to be fixed
    @JoinColumn(name = "userID")
    private User user;

    @Column(name = "categoryID")
    private Long categoryID;
}
