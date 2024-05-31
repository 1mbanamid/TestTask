package by.imbanamid.kirillporokh.test.Entity.Controller;

import by.imbanamid.kirillporokh.test.Entity.Post;
import by.imbanamid.kirillporokh.test.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class PostController {
  @Autowired private PostService postService;

  @PostMapping
  public Post createPost(@RequestBody Post post) {
    return postService.createPost(post);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Post> getPostById(@PathVariable Long id) {
    Optional<Post> post = postService.getPostById(id);
    return post.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
  }

  @PostMapping("/user/{userId}")
  public ResponseEntity<List<Post>> getPostsByUserId(@PathVariable Long userId) {
    List<Post> posts = postService.getPostsByUserId(userId);
    return ResponseEntity.ok(posts);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post postDetails) {
    Post updtedPost = postService.updatePost(id, postDetails);
    return ResponseEntity.ok(updtedPost);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletePost(@PathVariable Long id) {
    postService.deletePost(id);
    return ResponseEntity.noContent().build();
  }
}
