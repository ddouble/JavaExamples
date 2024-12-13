package org.example.demo.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link org.example.demo.model.Category}
 */
public class CategoryDto implements Serializable {
    private final Integer id;
    private final String categoryName;
    private final byte[] picture;

    public CategoryDto(Integer id, String categoryName, byte[] picture) {
        this.id = id;
        this.categoryName = categoryName;
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public byte[] getPicture() {
        return picture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryDto entity = (CategoryDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.categoryName, entity.categoryName) &&
                Objects.equals(this.picture, entity.picture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryName, picture);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "categoryName = " + categoryName + ", " +
                "picture = " + picture + ")";
    }
}