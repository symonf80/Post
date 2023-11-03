import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val data = WallService().add(Post()).id
        assertNotEquals(0, data)
    }

    @Test
    fun updateTrue() {
        val service = WallService()
        service.add(Post(1, 2, 3, 4, "test", Post.Comments(), "4", Post.Likes(), true, true))
        service.add(Post(2, 3, 4, 5, "test2", Post.Comments(), "4", Post.Likes(), true, true))
        service.add(Post(3, 4, 5, 6, "test3", Post.Comments(), "4", Post.Likes(), true, true))
        val update = Post(3, 2, 3, 4, "test", Post.Comments(), "4", Post.Likes(), true, true)
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun updateFalse() {
        val service = WallService()
        service.add(Post(1, 2, 3, 4, "test", Post.Comments(), "4", Post.Likes(), true, true))
        service.add(Post(2, 3, 4, 5, "test2", Post.Comments(), "4", Post.Likes(), true, true))
        service.add(Post(3, 4, 5, 6, "test3", Post.Comments(), "4", Post.Likes(), true, true))
        val update = Post(4, 2, 3, 4, "test", Post.Comments(), "4", Post.Likes(), true, true)
        val result = service.update(update)
        assertFalse(result)

    }
}
